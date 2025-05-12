package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.ItemStatus;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Item")
public class ItemEntity {

    @Id
    private String itemId;
    private String name;
    private String description;
    private LocalDate createdDate;
    private ItemStatus status;
}
