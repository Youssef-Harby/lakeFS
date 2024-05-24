import React from "react";
import DeckGL from "@deck.gl/react";
import { MapViewState } from "@deck.gl/core";
import { GeoArrowScatterplotLayer } from "@geoarrow/deck.gl-layers";
import Map, { NavigationControl } from "react-map-gl/maplibre";
import { Table } from "apache-arrow";

const INITIAL_VIEW_STATE: MapViewState = {
  longitude: -122.41669,
  latitude: 37.7853,
  zoom: 8,
  maxZoom: 16,
  pitch: 0,
  bearing: 0,
};

type BasicMapProps = {
  arrowTable: Table | null;
};

const BasicMap: React.FC<BasicMapProps> = ({ arrowTable }) => {
  if (!arrowTable) {
    return <div>Loading...</div>;
  }

  const geomColumn = arrowTable.getChild("geom");
  if (!geomColumn) {
    console.error("Geometry column 'geom' not found in the Arrow table");
    return <div>Error: Geometry column not found</div>;
  }

  const layers = [
    new GeoArrowScatterplotLayer({
      id: "scatter-plot",
      data: arrowTable,
      getPosition: (d: Table) => d.getChild("geom"),
      getFillColor: [255, 0, 255], // Optional: set color
      getRadius: 100, // Optional: set point radius
    }),
  ];

  return (
    <DeckGL initialViewState={INITIAL_VIEW_STATE} controller layers={layers}>
      <Map mapStyle="https://basemaps.cartocdn.com/gl/positron-nolabels-gl-style/style.json">
        <NavigationControl position="top-right" />
      </Map>
    </DeckGL>
  );
};

export default BasicMap;
