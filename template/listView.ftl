[
    {
    "id": "${listViewId}",
    "type": "listView",
    "appid": "${appId}",
    "parentid": "${parentId}",
    "name": "${objectName}WListView",
    "objectName": "${objectName}",
    "description": "${description}列表描述",
    "label": "${description}",
    "layoutJson": {
        "whereCondition": {},
        "columns": [
            <#list fields as field>
                <#if field_index == 0>
                <#else>
                ,
                </#if>
            {
                "sortDirection": "ascending",
                "hidden": false,
                "sortIndex": 0,
                "name": "${field.name}",
                "ascendingLabel": "Z-A",
                "label": "${field.description}",
                "sortable": true,
                "type": "string",
                "descendingLabel": "A-Z",
                "selectListItem": "${field.name}"
            }
            </#list>
        ],
        "scope": "everything",
        "limit": 10,
        "orderBy": [],
        "page": 1
        }
    }
]