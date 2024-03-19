package genesis;

import java.util.HashMap;

public class ComponentService {
    private String formData, formDataUpdate, foreignList;
    private HashMap<String, String> componentServiceName, specName;
    private HashMap<String, String> componentServiceContent, specContent;
    private HashMap<String, String> componentServiceSavePath;
    private String componentGetDataForeign, callGetDataForeign;
    private String fileExtension;

    public String getFormData() {
        return formData;
    }

    public void setFormData(String formData) {
        this.formData = formData;
    }

    public String getFormDataUpdate() {
        return formDataUpdate;
    }

    public void setFormDataUpdate(String formDataUpdate) {
        this.formDataUpdate = formDataUpdate;
    }

    public String getForeignList() {
        return foreignList;
    }

    public void setForeignList(String foreignList) {
        this.foreignList = foreignList;
    }

    public HashMap<String, String> getComponentServiceName() {
        return componentServiceName;
    }

    public void setComponentServiceName(HashMap<String, String> componentServiceName) {
        this.componentServiceName = componentServiceName;
    }

    public HashMap<String, String> getSpecName() {
        return specName;
    }

    public void setSpecName(HashMap<String, String> specName) {
        this.specName = specName;
    }

    public HashMap<String, String> getComponentServiceContent() {
        return componentServiceContent;
    }

    public void setComponentServiceContent(HashMap<String, String> componentServiceContent) {
        this.componentServiceContent = componentServiceContent;
    }

    public HashMap<String, String> getSpecContent() {
        return specContent;
    }

    public void setSpecContent(HashMap<String, String> specContent) {
        this.specContent = specContent;
    }

    public HashMap<String, String> getComponentServiceSavePath() {
        return componentServiceSavePath;
    }

    public void setComponentServiceSavePath(HashMap<String, String> componentServiceSavePath) {
        this.componentServiceSavePath = componentServiceSavePath;
    }

    public String getComponentGetDataForeign() {
        return componentGetDataForeign;
    }

    public void setComponentGetDataForeign(String componentGetDataForeign) {
        this.componentGetDataForeign = componentGetDataForeign;
    }

    public String getCallGetDataForeign() {
        return callGetDataForeign;
    }

    public void setCallGetDataForeign(String callGetDataForeign) {
        this.callGetDataForeign = callGetDataForeign;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
}
