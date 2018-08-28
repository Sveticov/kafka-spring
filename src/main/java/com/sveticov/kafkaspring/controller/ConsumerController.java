package com.sveticov.kafkaspring.controller;

import com.sveticov.kafkaspring.storage.MessageStorage;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsumerController {

    @Autowired
    MessageStorage storage;

@GetMapping("/")
    public String genPage(Model model){
    model.addAttribute("Text",storage.toString());
    storage.clear();
    return "gen_page.html";
}

}
