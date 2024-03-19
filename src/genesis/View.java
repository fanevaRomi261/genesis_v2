package genesis;

import java.util.HashMap;

public class View {
    private String viewForeignList;
    private String viewTableHeader;
    private String foreignFieldGet;
    private String viewTableLine;
    private String viewTableLineForeign;
    private String viewUpdateFormForeignField;
    private HashMap<String, String> viewUpdateFormField;
    private String viewInsertFormForeignField;
    private HashMap<String, String> viewInsertFormField;
    private HashMap<String, String> viewName;
    private HashMap<String, String> viewContent;
    private HashMap<String, String> viewSavePath;
    private String viewExtension;

    public String getViewForeignList() {
        return viewForeignList;
    }

    public void setViewForeignList(String viewForeignList) {
        this.viewForeignList = viewForeignList;
    }

    public String getViewTableHeader() {
        return viewTableHeader;
    }

    public void setViewTableHeader(String viewTableHeader) {
        this.viewTableHeader = viewTableHeader;
    }

    public String getForeignFieldGet() {
        return foreignFieldGet;
    }

    public void setForeignFieldGet(String foreignFieldGet) {
        this.foreignFieldGet = foreignFieldGet;
    }

    public String getViewTableLine() {
        return viewTableLine;
    }

    public void setViewTableLine(String viewTableLine) {
        this.viewTableLine = viewTableLine;
    }

    public String getViewTableLineForeign() {
        return viewTableLineForeign;
    }

    public void setViewTableLineForeign(String viewTableLineForeign) {
        this.viewTableLineForeign = viewTableLineForeign;
    }


    public String getViewUpdateFormForeignField() {
        return viewUpdateFormForeignField;
    }

    public void setViewUpdateFormForeignField(String viewUpdateFormForeignField) {
        this.viewUpdateFormForeignField = viewUpdateFormForeignField;
    }

    public HashMap<String, String> getViewUpdateFormField() {
        return viewUpdateFormField;
    }

    public void setViewUpdateFormField(HashMap<String, String> viewUpdateFormField) {
        this.viewUpdateFormField = viewUpdateFormField;
    }

    public String getViewInsertFormForeignField() {
        return viewInsertFormForeignField;
    }

    public void setViewInsertFormForeignField(String viewInsertFormForeignField) {
        this.viewInsertFormForeignField = viewInsertFormForeignField;
    }

    public HashMap<String, String> getViewInsertFormField() {
        return viewInsertFormField;
    }

    public void setViewInsertFormField(HashMap<String, String> viewInsertFormField) {
        this.viewInsertFormField = viewInsertFormField;
    }

    public HashMap<String, String> getViewName() {
        return viewName;
    }

    public void setViewName(HashMap<String, String> viewName) {
        this.viewName = viewName;
    }

    public HashMap<String, String> getViewContent() {
        return viewContent;
    }

    public void setViewContent(HashMap<String, String> viewContent) {
        this.viewContent = viewContent;
    }

    public HashMap<String, String> getViewSavePath() {
        return viewSavePath;
    }

    public void setViewSavePath(HashMap<String, String> viewSavePath) {
        this.viewSavePath = viewSavePath;
    }

    public String getViewExtension() {
        return viewExtension;
    }

    public void setViewExtension(String viewExtension) {
        this.viewExtension = viewExtension;
    }

}
