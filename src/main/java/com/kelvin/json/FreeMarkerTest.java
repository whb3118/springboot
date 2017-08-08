package com.kelvin.json;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by wangkun on 17-8-6.
 */
public class FreeMarkerTest {

    public static void main(String[] args) throws Exception {
        String appId = "PE";
        String description = "工艺图纸";
        String objectName = "PEZ0080";
        String jwtToken = ParaUtil.getJwtToken();
        String buttonId1 = ParaUtil.getNewID(jwtToken);
        String buttonId2 = ParaUtil.getNewID(jwtToken);
        String enumId1 = ParaUtil.getNewID(jwtToken);
        String enumId2 = ParaUtil.getNewID(jwtToken);
        String parentId = ParaUtil.getNewID(jwtToken);
        String buttonGuid1 = java.util.UUID.randomUUID().toString();
        String buttonGuid2 = java.util.UUID.randomUUID().toString();
        String formLayoutGuid = java.util.UUID.randomUUID().toString();
        String listViewId = ParaUtil.getNewID(jwtToken);
        String formLayoutId = ParaUtil.getNewID(jwtToken);
        String listViewLayoutId1 = ParaUtil.getNewID(jwtToken);
        String listViewLayoutId2 = ParaUtil.getNewID(jwtToken);
        String searchLayoutId = ParaUtil.getNewID(jwtToken);
        String tableLayoutId = ParaUtil.getNewID(jwtToken);
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        cfg.setDirectoryForTemplateLoading(new File("/Users/kelvin/git/springboot/template"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        Map root = new HashMap();
        List<Field> fields = ReadXlsx.readXlsx("/Users/kelvin/Documents/jietong/test.xlsx");
        List<List<Field>> fieldRows = convertFields(fields);
        if (fields.size() % 2 == 0) {
            root.put("formLayoutLast", 2);
        } else {
            root.put("formLayoutLast", 1);
        }
        root.put("tableLayoutId", tableLayoutId);
        root.put("searchLayoutId", searchLayoutId);
        root.put("formLayoutGuid", formLayoutGuid);
        root.put("formLayoutId", formLayoutId);
        root.put("listViewLayoutId1", listViewLayoutId1);
        root.put("listViewLayoutId2", listViewLayoutId2);
        root.put("fields", fields);
        root.put("appId", appId);
        root.put("description", description);
        root.put("objectName", objectName);
        root.put("buttonId1", buttonId1);
        root.put("buttonId2", buttonId2);
        root.put("parentId", parentId);
        root.put("buttonGuid1", buttonGuid1);
        root.put("buttonGuid2", buttonGuid2);
        root.put("listViewId", listViewId);
        root.put("enumId1", enumId1);
        root.put("enumId2", enumId2);
        root.put("fieldRows", fieldRows);
        outJson(cfg, "field", root);
        outJson(cfg, "button", root);
        outJson(cfg, "listView", root);
        outJson(cfg, "enum", root);
        outJson(cfg, "formLayout", root);
        outJson(cfg, "listviewLayout", root);
        outJson(cfg, "object", root);
        outJson(cfg, "searchLayout", root);
        outJson(cfg, "tableLayout", root);
    }

    private static void outJson(Configuration cfg, String jsonName, Map root) throws Exception {
        Template temp = cfg.getTemplate(jsonName + ".ftl");
        File file = new File("/Users/kelvin/git/springboot/outjson/" + jsonName + ".json");
        OutputStream fop = new FileOutputStream(file);
        Writer out = new OutputStreamWriter(fop);
        temp.process(root, out);
    }

    private static List<List<Field>> convertFields(List<Field> fields) {
        List<List<Field>> fieldRows = new ArrayList();
        List fieldRow = new ArrayList();
        for (int i = 0; i < fields.size(); i++) {
            fieldRow.add(fields.get(i));
            if ((i + 1) % 2 == 0) {
                fieldRows.add(fieldRow);
                fieldRow = new ArrayList<>();
            }
            if ((i + 1) == fields.size()) {
                fieldRows.add(fieldRow);
            }
        }
        return fieldRows;
    }
}
