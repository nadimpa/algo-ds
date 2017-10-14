package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class InputNode {
    public int emptyLines;
    ArrayList<String> entries;
    int size;
    public int getEmptyString(int i) {
        return 0;
    }
}

class OutputNode {
    ArrayList<String> entries;

    public OutputNode parseInputToOutput(InputNode inputNode) {
        OutputNode outputNode = new OutputNode();

        return outputNode;
    }
}

public class Packing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initial = sc.nextLine().split(":");
        int N = Integer.parseInt(initial[0]);
        boolean flag;
        if(initial[1].equals("True") ) {
            flag = true;
        } else {
            flag = false;
        }

        String openingBracket = sc.nextLine();
        ArrayList<InputNode> inputNodes = new ArrayList<>();
        ArrayList<String>  nonEmpty = new ArrayList<>();

        int counter = 0;

        for(int i=0;i<N;i++) {
            String open = sc.nextLine();
            InputNode node  = new InputNode();
            node.entries = new ArrayList<>();
            node.size = 0;
            while(true) {
                String line = sc.nextLine();
                if(line =="]") {
                    inputNodes.add(node);
                    break;
                }
                if(line == "") {
                    node.emptyLines += 1;
                    node.entries.add("");
                    node.size++;
//                    nonEmpty.add()
                } else {
                    node.entries.add(line);
                    nonEmpty.add(line);
                    node.size++;
                }
            }
        }

        int OutputNodeCount;
        int NodeCountDifference;
        int EmptySlotDifference;
        int EmptySlotCount;
        ArrayList<OutputNode> outputNodes =  new ArrayList<>();

        if(flag) {
            for(InputNode inputNode: inputNodes) {
                if(counter >= nonEmpty.size())
                    break;
                int size = inputNode.size;
                int emptyLines = inputNode.emptyLines;
                OutputNode outputNode = new OutputNode();
                for(int i=0;i<size;i++) {
                    outputNode.entries.add(nonEmpty.get(counter));
                    counter++;
                    if(counter >= nonEmpty.size())
                        break;
                }
                outputNodes.add(outputNode);

            }
        } else {

        }

        for(OutputNode outputNode: outputNodes) {
            System.out.println("[");
            for (String s: outputNode.entries) {
                System.out.println(s);
            }
            System.out.println("]");
        }


    }
}
