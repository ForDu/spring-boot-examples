package com.neo.model.repository.secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author neo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "second_mongo")
public class SecondaryMongoObject {

	public SecondaryMongoObject(String id,String value) {
		this.id = id;
		this.value = value;
	}
	
	@Id
	private String id;

	private String value;


	@Override
	public String toString() {
        return "SecondaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\''
				+ '}';
	}
}
