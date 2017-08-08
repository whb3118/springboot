[
    {
		"id":"${buttonId1}",
        "type": "button",
        "appid": "${appId}",
        "parentid": "${parentId}",
        "name": "${objectName}WButtons",
        "clientType":"pc",
    	"layoutType":"grid",
        "objectName": "${objectName}",
        "layoutJson":{
        	"configId": "${buttonGuid1}",
            "entityId": "${parentId}",
            "entity": "${objectName}",
            "btns": [
                    {
                        "name": "新建",
                        "type": "new"
                    },
                    {
                        "name": "删除",
                        "type": "del"
                    }
                ]
        },
        "description": "${description}GridButton定义"
    },
    {
		"id":"${buttonId2}",
        "type": "button",
        "appid": "${appId}",
        "parentid": "${parentId}",
        "name": "${objectName}WDetailButtons",
        "clientType":"pc",
    	"layoutType":"detail",
        "objectName": "${objectName}",
        "layoutJson":{
        	"configId": "${buttonGuid2}",
            "entityId": "${parentId}",
            "entity": "${objectName}",
            "layoutType":"detail",
	        "btns": [
	                    {
	                        "name": "新建",
	                        "type": "new"
	                    },
	                    {
	                        "name": "编辑",
	                        "type": "edit"
	                    },
	                    {
	                        "name": "删除",
	                        "type": "delete"
	                    }
	                ]
        },
        "description": "${description}detailButton定义"
    }
]