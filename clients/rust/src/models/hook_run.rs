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
pub struct HookRun {
    #[serde(rename = "hook_run_id")]
    pub hook_run_id: String,
    #[serde(rename = "action")]
    pub action: String,
    #[serde(rename = "hook_id")]
    pub hook_id: String,
    #[serde(rename = "start_time")]
    pub start_time: String,
    #[serde(rename = "end_time", skip_serializing_if = "Option::is_none")]
    pub end_time: Option<String>,
    #[serde(rename = "status")]
    pub status: Status,
}

impl HookRun {
    pub fn new(hook_run_id: String, action: String, hook_id: String, start_time: String, status: Status) -> HookRun {
        HookRun {
            hook_run_id,
            action,
            hook_id,
            start_time,
            end_time: None,
            status,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "failed")]
    Failed,
    #[serde(rename = "completed")]
    Completed,
}

impl Default for Status {
    fn default() -> Status {
        Self::Failed
    }
}

