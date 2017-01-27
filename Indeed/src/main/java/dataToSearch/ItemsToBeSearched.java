package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by rrt on 8/29/2016.
 */
public class ItemsToBeSearched {

    //Option 2, supply search.data from External source like excel files.
    DataReader dr = new DataReader();
    public String [] getData()throws IOException{
      // /Users/ahmadkarim/Desktop/projects/MavenProjects/Group_Project/Indeed/data/file1.xls

     String path =   System.getProperty("user.dir")+"/data/jobsToSearch.xls";
              //"/Users/ahmadkarim/Desktop/projects/MavenProjects/Group_Project/Indeed/data/file1.xls";

             //
       String [] st = dr.fileReader(path);
    return st;
  }
}
