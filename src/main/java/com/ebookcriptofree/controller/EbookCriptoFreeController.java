package com.ebookcriptofree.controller;

import com.ebookcriptofree.domain.EbookCriptoFree;
import com.ebookcriptofree.service.EbookCriptoFreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EbookCriptoFreeController {

    @Autowired
    private EbookCriptoFreeService ebookCriptoFreeService;

    @GetMapping("/cripto-free")
    public String index() {
        return "index";
    }

    @PostMapping("/cripto-free")
    public String cadastrarEbook(EbookCriptoFree ebookCriptoFree) {
        ebookCriptoFreeService.criarLead(ebookCriptoFree);
        return "pages/ebook";
    }


    @GetMapping("/receber-cripto-free")
    public ModelAndView receberEbook() {
        ModelAndView model = new ModelAndView("pages/ebook");
        Iterable<EbookCriptoFree> ebook = ebookCriptoFreeService.exibirPageEbook();
        model.addObject("ebook", ebook);
        return model;
    }

}









