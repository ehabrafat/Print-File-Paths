    public static void print(List<String> paths){
        String[] lastPath = {"/"};
        for(String path : paths){
            String[] branches = path.split("/");
            int l = 0, b = 0;
            int tabs = 0;
            while (l < lastPath.length && b < branches.length){
                if(lastPath[l].equals(branches[b])){
                    tabs  += 5 + lastPath[l].length();
                }
                 else{
                   break;
                }
                ++l;
                ++b;
            }
            while (tabs > 0){
                System.out.print(" ");
                --tabs;
            }
            while (b < branches.length)
                System.out.print(" --> " + branches[b++]);
            System.out.println();
            lastPath = branches;
        }

    }
