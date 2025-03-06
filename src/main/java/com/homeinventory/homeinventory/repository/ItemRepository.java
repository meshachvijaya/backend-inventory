package com.homeinventory.homeinventory.repository;

import com.homeinventory.homeinventory.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    void deleteByIdIn(List<Long> ids);
}
