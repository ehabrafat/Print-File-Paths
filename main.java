public static void print(List<String> path){
        String[] lastPath = {"/"};
        for(int i = 0; i< path.size(); i++){
            String[] branches = path.get(i).split("/");
            int l = 0, b = 0;
            while (l < lastPath.length && b < branches.length){
                if(lastPath[l].equals(branches[b])){
                    System.out.print(" ---");
                    String breaker = "|";
                    boolean first = true;
                    for (int len = 0; len < lastPath[l].length(); len++) {
                        if(first){
                            breaker = " " + breaker;
                        } else{
                            breaker = breaker + " ";
                        }
                        first = !first;
                    }
                    System.out.print(breaker);
                }
                 else{
                    System.out.print(" --> " + branches[b]);
                }
                ++l;
                ++b;
            }
            while (b < branches.length)
                System.out.print(" --> " + branches[b++]);
            System.out.println();
            lastPath = branches;
        }

    }
