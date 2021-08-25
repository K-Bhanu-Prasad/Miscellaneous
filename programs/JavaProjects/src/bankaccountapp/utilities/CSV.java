package bankaccountapp.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bkuraman
 *
 */
public class CSV {

  public static List<String[]> read(String file) throws IOException {

    List<String[]> list = new LinkedList();
    BufferedReader br = new BufferedReader(new FileReader(file));
    String dataRow;
    while ((dataRow = br.readLine()) != null) {
      String[] record = dataRow.split(",");
      list.add(record);
    }

    return list;

  }

}
