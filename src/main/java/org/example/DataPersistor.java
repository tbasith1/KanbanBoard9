package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

public class DataPersistor {
  private static KanbanBoard kanbanBoard = new KanbanBoard();
  private static Logger log = Logger.getLogger("log");

  private static boolean loadConfigFileParameter(String path){
    //load yml config
    Yaml yamlFile = new Yaml();
    try{
      InputStream in = Files.newInputStream(Paths.get(path));
      kanbanBoard = yamlFile.loadAs(in, KanbanBoard.class);

      return true;
    }
    catch (IOException e){
      log.log(Level.WARNING, "File '"+path+"' not found.");
      return false;
    }
  }
}
