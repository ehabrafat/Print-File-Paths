    public static void print(List<String> paths){
        String[] lastPath = {"/"};
        for(String path : paths){
            String[] branches = path.split("/");
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
                   break;
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
