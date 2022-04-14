package com.ebookcriptofree.repository;

import com.ebookcriptofree.domain.EbookCriptoFree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookCriptoFreeRepository extends JpaRepository< EbookCriptoFree, Long > {
}
