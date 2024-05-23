import React from "react";
import DeckGL from "@deck.gl/react";
import { MapViewState } from "@deck.gl/core";
import { LineLayer } from "@deck.gl/layers";
import Map, { NavigationControl } from "react-map-gl/maplibre";

const INITIAL_VIEW_STATE: MapViewState = {
  longitude: -122.41669,
  latitude: 37.7853,
  zoom: 13,
  pitch: 0,
  bearing: 0,
};

type DataType = {
  from: [longitude: number, latitude: number];
  to: [longitude: number, latitude: number];
};

// Sample data for the LineLayer
const data: DataType[] = [
  { from: [-122.41669, 37.7853], to: [-122.41669, 37.781] },
  { from: [-122.41669, 37.7853], to: [-122.41669, 37.789] },
];

const BasicMap: React.FC = () => {
  const layers = [
    new LineLayer<DataType>({
      id: "line-layer",
      data,
      getSourcePosition: (d: DataType) => d.from,
      getTargetPosition: (d: DataType) => d.to,
      getColor: [255, 0, 0], // optional: set color
      getWidth: 5, // optional: set line width
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
