[
	{
	    "id": "${listViewLayoutId1}",
	    "type": "listviewLayout",
	    "appid": "${appId}",
	    "parentid": "${parentId}",
	    "objectName": "${objectName}",
	    "description": "${description}",
	    "layoutJson": {
	    	"entity":"${objectName}",
	        "entityId":"${parentId}",
	        "configId":"${buttonGuid1}",
	        "label":"列表视图"
	    },
	    "category":"listview"
	},
	{
	    "id": "${listViewLayoutId2}",
	    "type": "listviewLayout",
	    "appid": "${appId}",
	    "parentid": "${parentId}",
	    "objectName": "${objectName}",
	    "description": "settingbutton布局",
	    "layoutJson": {
		"label": "列表视图",
        "parentEntity":"${objectName}",
        "parentEntityId":"${parentId}",
        "configId":"${buttonGuid1}",
        "entity":"listView",
        "entityId":"${listViewId}"
	    },
	    "category":"setting"
	}
]
