package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class DataPersistor {
  private static CanbanBoard canbanBoard = new CanbanBoard();
  private static Logger log = Logger.getLogger("log");


  
  
  
    /**
     * Load the data of CanbanBoard from a .yaml into the canbanBoard
     * @param path
     * @param canbanBoard
     * @return
     */
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

  /**
   * Saves the data of CanbanBoard to a .yaml file this the given name <i>path</i>.
   * @param path
   * @param canbanBoard
   * @return
   */
  public static CanbanBoard saveCanbanBoardData(String path, CanbanBoard canbanBoard){
    ObjectMapper om = new ObjectMapper(new YAMLFactory());
    try {
      om.writeValue(new File(path), canbanBoard);
    } catch (JsonGenerationException e) {
      log.log(Level.WARNING, e.getMessage());
      e.printStackTrace();
    } catch (JsonMappingException e) {
      log.log(Level.WARNING, e.getMessage());
      e.printStackTrace();
    } catch (IOException e) {
      log.log(Level.WARNING, e.getMessage());
      e.printStackTrace();
    }
    return canbanBoard;
  }
}
