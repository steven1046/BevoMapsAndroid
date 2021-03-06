package edu.utexas.cs.bevomaps;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import org.json.JSONObject;
import java.util.List;
import java.util.HashMap;

/**
 * BuildingJSON.java
 *
 * Created by John on 3/18/2015.
 */

@ParseClassName("BuildingJSON")
public class BuildingJSON extends ParseObject {
    public JSONObject getBuildingJSON() {
      return getJSONObject("Buildings");
    }

    public List<HashMap<String, String>> getMarkerList() {
        return getList("Markers");
    }

    public JSONObject getSearchMap() {return getJSONObject("SearchMap"); }
}
