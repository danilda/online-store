package ua.com.maist.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.maist.model.entity.ItemType;

import java.util.Set;

/**
 * Created by dach1016 on 07.08.2017.
 */

@Repository("itemTypeRepository")
public interface ItemTypeRepository extends JpaRepository<ItemType, Long> {
    Set<ItemType> findByParent(ItemType parent);
}