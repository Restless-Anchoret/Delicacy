package com.delicacycomics.delicacy.rest;

import com.delicacycomics.delicacy.dto.request.AddOrderRequestDto;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // @Autowired
    // private OrderService orderService;
    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping(path = "/add", method = POST)
    public ResponseEntity addOrder(@RequestBody AddOrderRequestDto addOrderRequestDto) {
        // todo
//        addOrderRequestDto.getNote();
//        addOrderRequestDto.getUserId();
        return new ResponseEntity(OK);
    }

    @RequestMapping(path = "/create", method = POST)
    public ResponseEntity createOrderFromBusket(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr()); // Getting IP Address of PC from which the request was made
        return new ResponseEntity(OK);
    }

}