package genesis.angular;

import genesis.Constantes;
import genesis.Entity;
import handyman.HandyManUtils;

public class Config {

    private String getTemplContent(String path) throws Exception{
        String content = HandyManUtils.getFileContent(Constantes.DATA_PATH +"/"+ path + "." + Constantes.MODEL_TEMPLATE_EXT);
        return content;
    }

    /*
     * -----------------
     * APP ROUTING MODULE
     * -----------------
     */

    private String getImport(Entity[] entities) throws Exception{
        
        String importTempl = this.getTemplContent("angular/app-routing/component_import");

        String importRep = "";
        for(Entity entity : entities){
            String temp = importTempl;
            temp = temp.replace("[classNameMaj]", HandyManUtils.majStart(entity.getClassName()));
            temp = temp.replace("[classNameMin]", HandyManUtils.minStart(entity.getClassName()));
            importRep += temp;
        }

        return importRep;
    }

    private String getRoutePath(Entity[] entities) throws Exception{
        
        String routePathTempl = this.getTemplContent("angular/app-routing/route_path");

        String rep = "";
        boolean isFirst = true;
        for(Entity entity : entities){
            String temp = routePathTempl;
            if(!isFirst){
                temp = "," + temp;
            }
            temp = temp.replace("[classNameMaj]", HandyManUtils.majStart(entity.getClassName()));
            temp = temp.replace("[classNameMin]", HandyManUtils.minStart(entity.getClassName()));

            rep += temp;
            isFirst = false;
        }

        return rep;
    }


    private void generateAppRouting(Entity[] entities,String projectName) throws Exception{
        
        String routing = this.getTemplContent("angular/app-routing/app-routing.module");

        routing = routing.replace("[component_imports]", this.getImport(entities));
        routing = routing.replace("[route_paths]", this.getRoutePath(entities));

        String path = "angular/"+HandyManUtils.majStart(projectName)+"/src/app/app-routing.module.ts";

        HandyManUtils.createFile(path);
        HandyManUtils.overwriteFileContent(path, routing);
    }

     /*
     * -----------------
     * NAV
     * -----------------
     */

    private String getNavChild(Entity[] entities) throws Exception{
        String navChild = this.getTemplContent("angular/nav/nav_child");

        String rep = "";
        boolean isFirst = true;
        for(Entity entity : entities){
            String temp = navChild;
            if(!isFirst){
                temp = "," + temp;
            }
            temp = temp.replace("[classNameMaj]", HandyManUtils.majStart(entity.getClassName()));
            temp = temp.replace("[classNameMin]", HandyManUtils.minStart(entity.getClassName()));

            rep += temp;
            isFirst = false;
        }

        return rep;
    }

    private void generateNav(Entity[] entities,String projectName) throws Exception{
        
        String routing = this.getTemplContent("angular/nav/_nav");

        routing = routing.replace("[nav_childs]", this.getNavChild(entities));

        String path = "angular/"+HandyManUtils.majStart(projectName)+"/src/app/containers/default-layout/_nav.ts";

        HandyManUtils.createFile(path);
        HandyManUtils.overwriteFileContent(path, routing);
    }

    /*
     * -----------------
     * API CONFIG
     * -----------------
     */

     private void generateApiConfig(String projectName) throws Exception{
        
        String routing = this.getTemplContent("angular/api.config/api.config");

        routing = routing.replace("[projectNameMaj]", HandyManUtils.majStart(projectName));

        String path = "angular/"+HandyManUtils.majStart(projectName)+"/src/app/api.config.ts";

        HandyManUtils.createFile(path);
        HandyManUtils.overwriteFileContent(path, routing);
    }

    /*
     * 
     * ATAMBATRA
     * 
     */

    public void generateConfigFile(Entity[] entities,String projectName) throws Exception {
        this.generateApiConfig(projectName);
        this.generateAppRouting(entities,projectName);
        this.generateNav(entities,projectName);
    }

}
