package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class DataPersistor {
  private static CanbanBoard canbanBoard = new CanbanBoard();
  private static Logger log = Logger.getLogger("log");




  private static CanbanBoard loadCanbanBoardData(String path){
    //load yml config
    Yaml yamlFile = new Yaml();
    try{
      InputStream in = Files.newInputStream(Paths.get(path));
      canbanBoard = yamlFile.loadAs(in, CanbanBoard.class);

      return canbanBoard;
    }
    catch (IOException e){
      log.log(Level.WARNING, "File '"+path+"' not found.");
      return null;
    }
  }




  public static boolean saveCanbanBoardData(String path, CanbanBoard canbanBoard){
    ObjectMapper om = new ObjectMapper(new YAMLFactory());
    try {
      om.writeValue(new File("src/main/data_examples/auto.yaml"), canbanBoard);
    } catch (JsonGenerationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JsonMappingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
