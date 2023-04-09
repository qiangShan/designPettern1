package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 策略工厂类
 * */

public class ReceiptStrategyFactory {

    public ReceiptStrategyFactory() {
    }

    //使用Map集合存储策略信息
    private static Map<String,ReceiptHandlerStrategy> strategyMap;

    //初始化具体策略，保存到map集合
    public static void init(){
        strategyMap=new HashMap<>();
        strategyMap.put("MT1101",new MT1101ReceiptHandlerStrategy());
        //strategyMap.put("MT2101",new MT2101ReceiptHandlerStrategy());
        //strategyMap.put("MT4101",new MT4101ReceiptHandlerStrategy());
        //strategyMap.put("MT8104",new MT8104ReceiptHandlerStategy());

        /**
        try {
            SAXReader reader=new SAXReader();
            String file="/Users/qiangshan/Downloads/tank-master/designPettern1/src/main/resources/config.xml";
            Document document = reader.read(file);
            Node node = document.selectSingleNode("/config/className");
            String className = node.getText();
            Class<?> aClass = Class.forName(className);
            ReceiptHandlerStrategy strategy=(ReceiptHandlerStrategy) aClass.newInstance();
            strategyMap.put("MT1101",strategy);
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
    }

    //根据回执类型，获取对应的策略对象
    public static ReceiptHandlerStrategy getStategy(String receiptType){
        return strategyMap.get(receiptType);
    }
}
