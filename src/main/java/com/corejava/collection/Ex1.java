package com.corejava.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1 {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("Connecting to database...");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from company");

			Map<String, Set<String>> mappedObjects = new HashMap<String, Set<String>>();

			List<List<String>> columinlist = new ArrayList<List<String>>();
			Set<String> set = new HashSet<>();

			while (rs.next()) {
				List<String> values = new ArrayList<>();

				String column1 = rs.getString(1);
				String column2 = rs.getString(2);
				String column3 = rs.getString(3);

				values.add(column1);
				values.add(column2);
				values.add(column3);

				columinlist.add(values);
				set.add(column1);

				/*
				 * if (mappedObjects.get(column1) != null) { values = (List<String>)
				 * mappedObjects.get(column1); } if (values.size() > 0) {
				 * values.add(rs.getString(2)); } else { values.add(rs.getString(2)); }
				 * mappedObjects.put(column1, values);
				 */
			}

			
				for (List<String> newlist : columinlist) {
					for (String string : set) {
					if (string.equals(newlist.get(0))) {
						Set<String> innerSet = new HashSet<>();
						innerSet.add(newlist.get(1));
						innerSet.add(newlist.get(2));
						Set<String> list = new HashSet<>();
						list = mappedObjects.get(newlist.get(0));
						if (list != null) {
							innerSet.addAll(list);
						}
						mappedObjects.put(newlist.get(0), innerSet);
					} else {
						Set<String> innerSet = new HashSet<>();
						innerSet.add(newlist.get(1));
						innerSet.add(newlist.get(2));
						Set<String> list = new HashSet<>();
						list = mappedObjects.get(newlist.get(0));
						if (list != null) {
							innerSet.addAll(list);
						}
						mappedObjects.put(newlist.get(0), innerSet);
					}

				}
			}

			for (Map.Entry<String, Set<String>> entry : mappedObjects.entrySet()) {
				String key = entry.getKey();
				Set<String> values = entry.getValue();
				System.out.println("Key = " + key);
				System.out.println("Values = " + values);

			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}