package com.coding.easier.translate;

import java.util.List;

/**
 * @author: D丶Cheng
 * @description: 谷歌翻译结果（为了方便Gson格式化，命名有点奇怪）
 * @create: 2019-08-30 17:58
 **/
public class GoogleTranslateResult {


    /**
     * sentences : [{"trans":"结果","orig":"result","backend":2},{"translit":"Jiéguǒ","src_translit":"riˈzəlt"}]
     * dict : [{"pos":"名词","terms":["结果","成果","效果","成绩","产物","成效","收获","功","名堂"],"entry":[{"word":"结果","reverse_translation":["result","outcome","consequence","effect","consequent","upshot"],"score":0.67663383},{"word":"成果","reverse_translation":["achievement","result","gain","profit","consequent","sequel"],"score":0.02749503},{"word":"效果","reverse_translation":["effect","result","sound effects","consequent","sequel"],"score":0.011642128},{"word":"成绩","reverse_translation":["score","achievement","result","mark"],"score":0.0039610346},{"word":"产物","reverse_translation":["product","result","outcome"],"score":0.0010999396},{"word":"成效","reverse_translation":["effect","result"],"score":6.074443E-4},{"word":"收获","reverse_translation":["gain","result","acquisition"],"score":5.921267E-5},{"word":"功","reverse_translation":["merit","achievement","meritorious service","accomplishment","exploit","result"],"score":5.7390887E-5},{"word":"名堂","reverse_translation":["variety","result","item"],"score":2.123383E-6}],"base_form":"result","pos_enum":1},{"pos":"动词","terms":["导致","致使","酿"],"entry":[{"word":"导致","reverse_translation":["lead to","cause","result","bring about","create"],"score":0.45783335},{"word":"致使","reverse_translation":["cause","result","occasion"],"score":8.174057E-4},{"word":"酿","reverse_translation":["brew","ferment","lead to","brew up","result","make wine"],"score":4.6644533E-7}],"base_form":"result","pos_enum":2}]
     * src : en
     * ld_result : {"srclangs":["en"],"srclangs_confidences":[1],"extended_srclangs":["en"]}
     */

    private String src;
    //    private LdResultBean ldResult;
    private List<SentencesBean> sentences;
    private List<DictBean> dict;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

//    public LdResultBean getLdResult() {
//        return ldResult;
//    }
//
//    public void setLdResult(LdResultBean ldResult) {
//        this.ldResult = ldResult;
//    }

    public List<SentencesBean> getSentences() {
        return sentences;
    }

    public void setSentences(List<SentencesBean> sentences) {
        this.sentences = sentences;
    }

    public List<DictBean> getDict() {
        return dict;
    }

    public void setDict(List<DictBean> dict) {
        this.dict = dict;
    }

//    public static class LdResultBean {
////        private List<String> srclangs;
////        private List<Integer> srclangsConfidences;
////        private List<String> extendedSrclangs;
////
////        public List<String> getSrclangs() {
////            return srclangs;
////        }
////
////        public void setSrclangs(List<String> srclangs) {
////            this.srclangs = srclangs;
////        }
////
////        public List<Integer> getSrclangsConfidences() {
////            return srclangsConfidences;
////        }
////
////        public void setSrclangsConfidences(List<Integer> srclangsConfidences) {
////            this.srclangsConfidences = srclangsConfidences;
////        }
////
////        public List<String> getExtendedSrclangs() {
////            return extendedSrclangs;
////        }
////
////        public void setExtendedSrclangs(List<String> extendedSrclangs) {
////            this.extendedSrclangs = extendedSrclangs;
////        }
////
////        @Override
////        public String toString() {
////            return "LdResultBean{" +
////                    "srclangs=" + srclangs +
////                    ", srclangsConfidences=" + srclangsConfidences +
////                    ", extendedSrclangs=" + extendedSrclangs +
////                    '}';
////        }
////    }

    public static class SentencesBean {
        /**
         * trans : 结果
         * orig : result
         * backend : 2
         * translit : Jiéguǒ
         * src_translit : riˈzəlt
         */

        private String trans;
        private String orig;
        private int backend;
        private String translit;
        private String srcTranslit;

        public String getTrans() {
            return trans;
        }

        public void setTrans(String trans) {
            this.trans = trans;
        }

        public String getOrig() {
            return orig;
        }

        public void setOrig(String orig) {
            this.orig = orig;
        }

        public int getBackend() {
            return backend;
        }

        public void setBackend(int backend) {
            this.backend = backend;
        }

        public String getTranslit() {
            return translit;
        }

        public void setTranslit(String translit) {
            this.translit = translit;
        }

        public String getSrcTranslit() {
            return srcTranslit;
        }

        public void setSrcTranslit(String srcTranslit) {
            this.srcTranslit = srcTranslit;
        }

        @Override
        public String toString() {
            return orig + "\n" + trans + "\n";
        }

//        @Override
//        public String toString() {
//            return String.format("<span style='font-size:11px;font-weight: bold;'>%s的翻译</span>\n<span style='font-size:13px;font-weight: bold;color: #dcbb3e;'>%s</span>", orig, trans);
//        }
    }

    public static class DictBean {
        /**
         * pos : 名词
         * terms : ["结果","成果","效果","成绩","产物","成效","收获","功","名堂"]
         * entry : [{"word":"结果","reverse_translation":["result","outcome","consequence","effect","consequent","upshot"],"score":0.67663383},{"word":"成果","reverse_translation":["achievement","result","gain","profit","consequent","sequel"],"score":0.02749503},{"word":"效果","reverse_translation":["effect","result","sound effects","consequent","sequel"],"score":0.011642128},{"word":"成绩","reverse_translation":["score","achievement","result","mark"],"score":0.0039610346},{"word":"产物","reverse_translation":["product","result","outcome"],"score":0.0010999396},{"word":"成效","reverse_translation":["effect","result"],"score":6.074443E-4},{"word":"收获","reverse_translation":["gain","result","acquisition"],"score":5.921267E-5},{"word":"功","reverse_translation":["merit","achievement","meritorious service","accomplishment","exploit","result"],"score":5.7390887E-5},{"word":"名堂","reverse_translation":["variety","result","item"],"score":2.123383E-6}]
         * base_form : result
         * pos_enum : 1
         */

        private String pos;
        //        private String baseForm;
        private int posEnum;
        //        private List<String> terms;
        private List<EntryBean> entry;

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

//        public String getBaseForm() {
//            return baseForm;
//        }
//
//        public void setBaseForm(String baseForm) {
//            this.baseForm = baseForm;
//        }

        public int getPosEnum() {
            return posEnum;
        }

        public void setPosEnum(int posEnum) {
            this.posEnum = posEnum;
        }

//        public List<String> getTerms() {
//            return terms;
//        }
//
//        public void setTerms(List<String> terms) {
//            this.terms = terms;
//        }

        public List<EntryBean> getEntry() {
            return entry;
        }

        public void setEntry(List<EntryBean> entry) {
            this.entry = entry;
        }

        public static class EntryBean {
            /**
             * word : 结果
             * reverse_translation : ["result","outcome","consequence","effect","consequent","upshot"]
             * score : 0.67663383
             */
            private String word;
            private double score;
            private List<String> reverseTranslation;

            public String getWord() {
                return word;
            }

            public void setWord(String word) {
                this.word = word;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public List<String> getReverseTranslation() {
                return reverseTranslation;
            }

            public void setReverseTranslation(List<String> reverseTranslation) {
                this.reverseTranslation = reverseTranslation;
            }

            @Override
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(word).append("  ");
                for (int i = 0, len = reverseTranslation.size(); i < len; i++) {
                    stringBuilder.append(reverseTranslation.get(i));
                    if (i < len - 1) {
                        stringBuilder.append(", ");
                    }
                }
                return stringBuilder.toString();
            }
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<span style='color: #33c0c1;'>").append(pos).append("</span><br>");
            for (EntryBean entryBean : entry) {
                stringBuilder.append("<span>").append(entryBean).append("</span><br>");
            }
            return stringBuilder.toString();
        }
//        @Override
//        public String toString() {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(pos).append("\n");
//            for (EntryBean entryBean : entry) {
//                stringBuilder.append(entryBean).append("\n");
//            }
//            return stringBuilder.toString();
//        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (sentences.size() == 1 || sentences.size() == 2) {
            SentencesBean sentencesBean = sentences.get(0);
            stringBuilder.append(sentencesBean).append("\n");
            if (!sentencesBean.getOrig().equals(sentencesBean.getTrans()) && dict != null) {
                for (int i = 0, len = dict.size(); i < len; i++) {
                    stringBuilder.append(dict.get(i));
                }
            }
        } else {
            for (SentencesBean sentence : sentences) {
                if (sentence.getTrans() != null) {
                    stringBuilder.append(sentence.getTrans());
                }
            }
        }
        return stringBuilder.toString();
    }

//    public static void main(String[] args) {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//        Gson gson = gsonBuilder.create();
//        String responseText = "{\"sentences\":[{\"trans\":\"结果\",\"orig\":\"result\",\"backend\":2},{\"translit\":\"Jiéguǒ\",\"src_translit\":\"riˈzəlt\"}],\"dict\":[{\"pos\":\"名词\",\"terms\":[\"结果\",\"成果\",\"效果\",\"成绩\",\"产物\",\"成效\",\"收获\",\"功\",\"名堂\"],\"entry\":[{\"word\":\"结果\",\"reverse_translation\":[\"result\",\"outcome\",\"consequence\",\"effect\",\"consequent\",\"upshot\"],\"score\":0.67663383},{\"word\":\"成果\",\"reverse_translation\":[\"achievement\",\"result\",\"gain\",\"profit\",\"consequent\",\"sequel\"],\"score\":0.02749503},{\"word\":\"效果\",\"reverse_translation\":[\"effect\",\"result\",\"sound effects\",\"consequent\",\"sequel\"],\"score\":0.011642128},{\"word\":\"成绩\",\"reverse_translation\":[\"score\",\"achievement\",\"result\",\"mark\"],\"score\":0.0039610346},{\"word\":\"产物\",\"reverse_translation\":[\"product\",\"result\",\"outcome\"],\"score\":0.0010999396},{\"word\":\"成效\",\"reverse_translation\":[\"effect\",\"result\"],\"score\":6.074443E-4},{\"word\":\"收获\",\"reverse_translation\":[\"gain\",\"result\",\"acquisition\"],\"score\":5.921267E-5},{\"word\":\"功\",\"reverse_translation\":[\"merit\",\"achievement\",\"meritorious service\",\"accomplishment\",\"exploit\",\"result\"],\"score\":5.7390887E-5},{\"word\":\"名堂\",\"reverse_translation\":[\"variety\",\"result\",\"item\"],\"score\":2.123383E-6}],\"base_form\":\"result\",\"pos_enum\":1},{\"pos\":\"动词\",\"terms\":[\"导致\",\"致使\",\"酿\"],\"entry\":[{\"word\":\"导致\",\"reverse_translation\":[\"lead to\",\"cause\",\"result\",\"bring about\",\"create\"],\"score\":0.45783335},{\"word\":\"致使\",\"reverse_translation\":[\"cause\",\"result\",\"occasion\"],\"score\":8.174057E-4},{\"word\":\"酿\",\"reverse_translation\":[\"brew\",\"ferment\",\"lead to\",\"brew up\",\"result\",\"make wine\"],\"score\":4.6644533E-7}],\"base_form\":\"result\",\"pos_enum\":2}],\"src\":\"en\",\"ld_result\":{\"srclangs\":[\"en\"],\"srclangs_confidences\":[1.0],\"extended_srclangs\":[\"en\"]}}";
//        String responseText2 = "{\"sentences\":[{\"trans\":\"An idea plugin that improves development efficiency, the original intention is to write some commonly used functions to this plugin to improve coding efficiency. \",\"orig\":\"一个提升开发效率的idea插件，初衷就是将一些常用的功能写入到这个插件，提高编码效率。\",\"backend\":3,\"translation_engine_debug_info\":[{\"model_tracking\":{\"checkpoint_md5\":\"42aef7b0a5e950954fab74776e36dabe\",\"launch_doc\":\"\"}}]},{\"trans\":\"However, because there is too little information in this area, the new feature update may be relatively slow, but I will slowly add more features. I will add comments to the code to make the code as simple as possible. \",\"orig\":\"但是因为这方面的资料过少的原因， 所以新功能更新可能会相对缓慢，但是一定会慢慢加入更多的功能，我会在代码中加入注释，尽量让代码简单易懂，也算是为了尽量\",\"backend\":3,\"translation_engine_debug_info\":[{\"model_tracking\":{\"checkpoint_md5\":\"42aef7b0a5e950954fab74776e36dabe\",\"launch_doc\":\"\"}}]},{\"trans\":\"Let it be a reference for more people to write their own plugins. \",\"orig\":\"让它成为让一个更多人能自己编写插件的参考资料吧。\",\"backend\":3,\"translation_engine_debug_info\":[{\"model_tracking\":{\"checkpoint_md5\":\"42aef7b0a5e950954fab74776e36dabe\",\"launch_doc\":\"\"}}]},{\"trans\":\"Of course, you are welcome to submit feedback. You can also suggest the features you want to implement. If the suggestions are really good and time permits, I will try to add them.\",\"orig\":\"当然也欢迎提交反馈，有想要实现的功能也可以建议，要是建议确实不错且时间允许，我就会尝试添加。\",\"backend\":3,\"translation_engine_debug_info\":[{\"model_tracking\":{\"checkpoint_md5\":\"42aef7b0a5e950954fab74776e36dabe\",\"launch_doc\":\"\"}}]},{\"src_translit\":\"Yīgè tíshēng kāifā xiàolǜ de idea chājiàn, chūzhōng jiùshì jiāng yīxiē chángyòng de gōngnéng xiě rù dào zhège chājiàn, tígāo biānmǎ xiàolǜ. Dànshì yīnwèi zhè fāngmiàn de zīliàoguò shǎo de yuányīn, suǒyǐ xīn gōngnéng gēngxīn kěnéng huì xiāngduì huǎnmàn, dànshì yīdìng huì màn man jiārù gèng duō de gōngnéng, wǒ huì zài dàimǎ zhōng jiārù zhùshì, jǐnliàng ràng dàimǎ jiǎndān yì dǒng, yě suànshì wèile jǐnliàng ràng tā chéngwéi ràng yīgè gèng duō rén néng zìjǐ biānxiě chājiàn de cānkǎo zīliào ba. Dāngrán yě huānyíng tíjiāo fǎnkuì, yǒu xiǎng yào shíxiàn de gōngnéng yě kěyǐ jiànyì, yàoshi jiànyì quèshí bùcuò qiě shíjiān yǔnxǔ, wǒ jiù huì chángshì tiānjiā.\"}],\"src\":\"zh-CN\",\"ld_result\":{\"srclangs\":[\"zh-CN\"],\"srclangs_confidences\":[1.0],\"extended_srclangs\":[\"zh-CN\"]}}";
//        GoogleTranslateResult translateResult = gson.fromJson(responseText, GoogleTranslateResult.class);
//        System.out.println(translateResult.toString());
//        List<String> list = new ArrayList<>();
//        for (DictBean dictBean : translateResult.dict) {
//            for (DictBean.EntryBean entryBean : dictBean.getEntry()) {
//                list.add(entryBean.word);
//            }
//        }
//    }
}
