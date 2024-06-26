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
pub struct ImportLocation {
    /// Path type, can either be 'common_prefix' or 'object'
    #[serde(rename = "type")]
    pub r#type: Type,
    /// A source location to a 'common_prefix' or to a single object. Must match the lakeFS installation blockstore type.
    #[serde(rename = "path")]
    pub path: String,
    /// Destination for the imported objects on the branch. Must be a relative path to the branch. If the type is an 'object', the destination is the exact object name under the branch. If the type is a 'common_prefix', the destination is the prefix under the branch. 
    #[serde(rename = "destination")]
    pub destination: String,
}

impl ImportLocation {
    pub fn new(r#type: Type, path: String, destination: String) -> ImportLocation {
        ImportLocation {
            r#type,
            path,
            destination,
        }
    }
}
/// Path type, can either be 'common_prefix' or 'object'
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "common_prefix")]
    CommonPrefix,
    #[serde(rename = "object")]
    Object,
}

impl Default for Type {
    fn default() -> Type {
        Self::CommonPrefix
    }
}

