/*
 * lakeFS API
 *
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: services@treeverse.io
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Ref {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "commit_id")]
    pub commit_id: String,
}

impl Ref {
    pub fn new(id: String, commit_id: String) -> Ref {
        Ref {
            id,
            commit_id,
        }
    }
}

