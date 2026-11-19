public class SortedTreeSet implements SortedTreeSetInterface
{

    private Person person;
    private SortedTreeSet left;
    private SortedTreeSet right;

    public Person getPerson()
    {
        return this.person;
    }

    public boolean hasLeft()
    {
        if(this.left != null){ return true;}
        return false;
    }

    public void setLeft(SortedTreeSet left)
    {
        this.left = left;
    }

    public SortedTreeSet getLeft()
    {
        return this.left;
    }

    public boolean hasRight()
    {
        if(this.right != null){return true;}
        return false;
    }

    public void setRight(SortedTreeSet right)
    {
        this.right = right;
    }

    public SortedTreeSet getRight()
    {
        return this.right;
    }

    //This method is a recursive function that will take Person p and
    // if the Node has no person, add it.
    // Otherwise, compare the name to the name of the person in the node and
    // if it returns negative, goes left, right if positive.
    // two checks each in the left and rights, if no left/right, create a new node
    // and set that node's person to p. However, if left/right isn't null, recall
    // the function on that node to pass it down.
    public void add(Person p)
    {
        //3 compares needed
        if(this.person == null){this.person = p; return;}

        // if negative (p.name comes before this.name)
        if(p.compareTo(this.person) < 0)
        {
            //If left node is null, create new node, set that n.person = p, set this n.left to new node
            if(this.left == null)
            {
                SortedTreeSet tree = new SortedTreeSet();
                tree.person = p;
                this.left = tree;
                return;
            }
            //Left isn't empty, recall the function on the left node
            else
            {
                this.left.add(p);
                return;
            }
        }
        //if positive (p.name comes after this.name)
        if(p.compareTo(this.person) > 0)
        {
            //Same process as left, but for the right.
            if(this.right == null)
            {
                SortedTreeSet tree = new SortedTreeSet();
                tree.person = p;
                this.right = tree;
                return;
            }
            else
            {
                this.right.add(p);
                return;
            }
        }

        //Third case is if the compareTo == 0, so do nothing because that's a duplicate.

    }//add()

}//SortedTreeSet
