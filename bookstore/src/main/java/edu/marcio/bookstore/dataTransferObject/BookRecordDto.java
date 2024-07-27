package edu.marcio.bookstore.dataTransferObject;

import java.util.Set;
import java.util.UUID;

/*the record is used when we just want to store data, which means the datas won't chenge, in such cases it makes the code simple to read once some methods (getters, setters, constructor, equals, hashCode and toString) are hidden because they are provided by the java compiler*/
public record BookRecordDto(String title, UUID publisherId, Set<UUID> authorIds, String reviewComment) {
    
}
