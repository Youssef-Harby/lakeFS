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
pub struct AuthCapabilities {
    #[serde(rename = "invite_user", skip_serializing_if = "Option::is_none")]
    pub invite_user: Option<bool>,
    #[serde(rename = "forgot_password", skip_serializing_if = "Option::is_none")]
    pub forgot_password: Option<bool>,
}

impl AuthCapabilities {
    pub fn new() -> AuthCapabilities {
        AuthCapabilities {
            invite_user: None,
            forgot_password: None,
        }
    }
}

