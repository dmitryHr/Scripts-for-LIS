package com.projdh.dictionary;


import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONValue;

import com.projdh.nameElements.NameForElements;

public class Create_region {
	
	public static void main (String [] args) { 
		Map resultJson = new LinkedHashMap();
		NameForElements nmEpq = new NameForElements();
		
		for (int i =1; i<300; i++){
			resultJson.put("macroRegionId",new Integer(800));
			resultJson.put("name", "ur_shablon" + i);
			resultJson.put("numberClassId", new Integer(800 + new Random().nextInt(4)));
			resultJson.put("priority", new Random().nextInt(100));
			resultJson.put("isDefault", new Random().nextBoolean());
						
			String jsonText = JSONValue.toJSONString(resultJson);
			System.out.print("curl --header \"authToken: $TOKEN\" --header \"Content-Type: application/json\" -d \'");
			System.out.print(jsonText);
			System.out.print("' http://srv2-gf-lisdv01.net.billing.ru/OAPI/v1/lis/logicalResources/phoneNumberClassTemplates");
			
			
			
			System.out.println();
			
			
			
		}
	}
}
