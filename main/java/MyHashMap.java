public class MyHashMap<k,v> {
    MyLinkdList <k> myLinkdList;

    public MyHashMap(){
        this.myLinkdList = new MyLinkdList<>();
    }

    public v get(k key) {
        MyMapNode<k,v> myMapNode = (MyMapNode<k, v>) this.myLinkdList.searchNode(key);
        return (myMapNode == null ) ? null : myMapNode.getValue();
    }

    public void add(k key, v value) {
        MyMapNode<k,v> myMapNode = (MyMapNode<k, v>) this.myLinkdList.searchNode(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkdList.append(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }


    @Override
    public String toString(){
        return "MyHashMapNodes{" + myLinkdList + "}";
    }
}

