[
  {
    "id": "${searchLayoutId}",
    "type": "searchLayout",
    "appid": "GE",
    "parentid": "${parentId}",
    "name": "${objectName}WSearchLayout",
    "objectName": "${objectName}",
    "layoutJson": {
      "configId": "${buttonGuid1}",
      "entityId": "${parentId}",
      "entity": "${objectName}",
      "columns": [
        <#list fields as field>
          <#if field_index == 0>
          <#else>
          ,
          </#if>
          {
          "config": {
          "size": "small"
          },
          "label": "${field.description}",
          "name": "${field.name}"
          }
        </#list>
      ]
    },
    "description": "${description}searchLayout定义"
  }
]