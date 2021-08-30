  static boolean printTap = false;
    static String getSTextAsSpace(String text){
        StringBuilder space = new StringBuilder();
        for(int i = 0; i< text.length(); i++){
            space.append(" ");
        }
        return space.toString();
    }
    private static void drawOnScreen(Node current, String taps){
        if(printTap){
            System.out.print("\n" + taps);
            printTap = false;
        }
        String text = " --> " + current.val;
        System.out.print(text);
        String tapsIn =  getSTextAsSpace(text) + taps;
        for(Node child : current.childs){
            drawOnScreen(child, tapsIn);
        }
        if(current.childs.isEmpty())
            printTap = true;
    }
    private static Node hasNode(Node node, String val){
        for(Node temp : node.childs){
            if(temp.val.equals(val))
                return temp;
        }
        return null;
    }
    public static void print(List<String> paths){
        Node root = new Node("/");
        for(String path : paths){
            String[] folders = path.split("/");
            Node current = root;
            for(String file : folders){
                Node newNode = hasNode(current, file);
                if(newNode == null){
                    newNode = new Node(file);
                    current.childs.add(newNode);
                }
                current = newNode;
            }

        }
        for(Node child : root.childs)
             drawOnScreen(child, "");
    }
