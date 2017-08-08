[
  {
    "id": "${formLayoutId}",
    "type": "formLayout",
    "appid": "${appId}",
    "parentid": "${parentId}",
    "name": "${objectName}WformLayout",
    "objectName": "${objectName}",
    "layoutJson": {
      "gutterType": "two-row",
      "inline": false,
      "labelPosition": "top",
      "configId": "${formLayoutGuid}",
      "ColumnLayout": [
        {
          "heading": "",
          "useCollapsibleSection": false,
          "layoutRows": [
            <#list fieldRows as fieldRow>
              <#if fieldRow_index == 0>
              <#else>
              ,
              </#if>
              {

                "layoutItems": [
                <#list fieldRow as field>
                  <#if field_index == 0>
                  <#else>
                  ,
                  </#if>
                  {
                    "componentId": "${field.name}",
                    "componentTitle": "${field.description}",
                    "componentName": "${field.name}",
                    "tag": "MetaInput",
                    "config": {
                      "formRules": [
                        {
                          "trigger": "blur",
                          "message": "请输入${field.description}",
                          "required": true
                        }
                      ],
                      "isArea": false,
                      "icon": ""
                    }
                  }
                </#list>
              ],
              "numItems": <#if fieldRow?has_next>2<#else>${formLayoutLast}</#if>
            }
            </#list>
          ]
        }
      ],
      "entityId": "${parentId}",
      "entity": "${objectName}"
    },
    "description": "${description}FormLayOut定义"
  }
]