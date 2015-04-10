package com.binaryTree.controller;

import com.binaryTree.domain.Node;
import com.binaryTree.domain.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


@Controller
public class HelloController {

    @Autowired
    private Node node;

    @Autowired
    private Tree tree;

	@RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public int printWelcome() {
        
        List<Integer> numbers = generateData();

        for (Integer number : numbers) {

            System.out.println(number.intValue());
            tree.insertElements(numbers);
            //return number.intValue();
        }

        return 999;
	}
    
    public List<Integer> generateData(){
        
        List<Integer> numbers = new ArrayList<Integer>();

        Random ran = new Random();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 1; i <= 14; i++)
            al.add(i);
        int[] number = new int[9];

        for(int i = 0; i < number.length; i++)
        {
            number[i] = al.remove(ran.nextInt(al.size()));

            numbers.add(number[i]);
        }


        Collections.shuffle(numbers);
        return numbers;
    }
}