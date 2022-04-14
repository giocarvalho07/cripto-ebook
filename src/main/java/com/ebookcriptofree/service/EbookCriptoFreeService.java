package com.ebookcriptofree.service;

import com.ebookcriptofree.domain.EbookCriptoFree;
import com.ebookcriptofree.repository.EbookCriptoFreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookCriptoFreeService {

    @Autowired
    EbookCriptoFreeRepository ebookCriptoFreeRepository;

    public void criarLead(EbookCriptoFree ebookCriptoFree){
        ebookCriptoFreeRepository.save(ebookCriptoFree);
    }

    public Iterable<EbookCriptoFree> exibirPageEbook(){return ebookCriptoFreeRepository.findAll();
    }
}
