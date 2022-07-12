package com.capgemini.vsestrutural.charpter.api;


import com.capgemini.vsestrutural.charpter.dominio.dto.ConsumerDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/consumer")
public class ConsumerResource {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerResource.class);


    @GetMapping("/{id}")
    public void consultar(@PathVariable("id") Integer id) {
        ConsumerDTO consumerDTO = ConsumerDTO.builder()
                .id(id)
                .transactionNumber("120720221")
                .email("vsestrutural@capgemini.com")
                .build();

        logger.info(" log from {}" + consumerDTO, ConsumerResource.class.getSimpleName());

    }

}
