<h2>Time Complexity</h2>
<h3>Big O notation</h3>
* We need to check the number of the operations involved in the code, for time complexity.


    Suppose we have to find a number from the given array.
    The first element can be find easily. Whereas, the middle
    element needs more time and the last element needs the
    highest time, if the algorithm starts the execution from
    beginning. The first case, which is the best case, can be
    represented by big Omega(Ω), The Average case can be
    represented by big Heta(U+0398), and the worst case can be
    represented by big O(O).

<table style="text-align:center">
    <caption><h3>Example</h3></caption>
    <th>1</th>
    <th>2</th>
    <th>3</th>
    <th>4</th>
    <th>5</th>
    <th>6</th>
    <th>7</th>
    <tr>
        <td>&#937</td>
        <td  colspan="2">&nbsp; <!-- EMPTY --></td>
        <td>&#920;</td>
        <td  colspan="2">&nbsp; <!-- EMPTY --></td>
        <td>O</td>
    </tr>
</table>

<h3>Big O</h3>

* O(1)

    ```
    private int multiPly(int n){ return n*n }
    ```

    In the multiPly method it is accepting a number and returning the value of it's square. Here whatever the value of n will be, the number of operation will always be 1. This is called Big O(1).

* O(n)

    ```
    private static void printNums(int n)
    {
        for (int i=0; i<n; i++)
            System.out.println(i);
    }
    ```
    In the printNums method, it is accepting an integer and running for loop based on the range of the integer. So if the number is 10 then the loop will run for 10 times, if the number is 1000 then the loop will run for 1000 times. So the number of operations are infinite. For this scenario the time complexity is Big O(n).
    ```
    private static void printNums(int n)
    {
        for (int i=0; i<n; i++)
            System.out.println(i);
        for (int j=0; j<n; j++)
            System.out.println(j);
    }
    ```
    In above code there are two identical for loop, which are having time complexity as O(n). We can say O(n) + O(n) = O(2n). If we simplify this, then we can drop the constant 2. After dropping, it will come as <b><u>Big O(n)</u></b>.
    * As n&#10140;&#8734;, so constant factors are not a big deal.

* O(n&#0178;)

    ```
    private static void printNums(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
                System.out.println(j);
        }
    }
    ```
    In above code, we have two nested loops. Where the operation will run for n*n times, which is n&#0178; times. So here the time complexity is Big O(n&#0178;).
    * If there was any more number of operations then the complexity would be Big O(n) and so on.

    ```
    private static void printNums(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
                System.out.println(j);
        }
        for (int k=0; k<n; k++)
            System.out.println(k);
    }
    ```
    Here the time complexity is Big O(n&#0178;) + O(n) = Big O(n&#0178; + n). So, n&#0178; is dominant term and n is non-dominant term. So we can drop n and the complexity will be Big O(n&#0178;).

* O(log n)

    Big O(log n) represents logarithmic time complexity. Let's assume we have a sorted array.
    <table style="text-align:center; border: 1px solid black;">
        <caption><h3>Sorted Array</h3></caption>
        <th style="border: 1px solid black;">1</th>
        <th style="border: 1px solid black;">3</th>
        <th style="border: 1px solid black;">2</th>
        <th style="border: 1px solid black;">4</th>
        <th style="border: 1px solid black;">5</th>
        <th style="border: 1px solid black;">6</th>
        <th style="border: 1px solid black;">7</th>
        <th style="border: 1px solid black;">8</th>
    </table>
    Now, we have to search for element 1 from this array. By using divide and conquer rule, first we divide the array in two parts.
    <table style="text-align:center; border: 1px solid black;">
        <caption><h3>Sorted Array</h3></caption>
        <th style="border: 1px solid black;">1</th>
        <th style="border: 1px solid black;">2</th>
        <th style="border: 1px solid black;">3</th>
        <th style="border: 1px solid black;">4</th>
        <th style="border-top: hidden; border-bottom: hidden;">&nbsp; <!-- EMPTY --></th>
        <th style="border: 1px solid black;">5</th>
        <th style="border: 1px solid black;">6</th>
        <th style="border: 1px solid black;">7</th>
        <th style="border: 1px solid black;">8</th>
        <tr>
            <td colspan="4" style="border: 1px solid black;">First part</td>
            <td style="border-bottom: hidden;">&nbsp; <!-- EMPTY --></td>
            <td colspan="4" style="border: 1px solid black;">Second part</td>
        </tr>
    </table>
    Now, we know that 1 is in the first part as the array is sorted. So we will leave second part and use divide and conquer rule for the first part again.
    <table style="text-align:center; border: 1px solid black;">
        <caption><h3>Sorted Array</h3></caption>
        <th style="border: 1px solid black;">1</th>
        <th style="border: 1px solid black;">2</th>
        <th style="border-top: hidden; border-bottom: hidden;">&nbsp; <!-- EMPTY --></th>
        <th style="border: 1px solid black;">3</th>
        <th style="border: 1px solid black;">4</th>
        <tr>
            <td colspan="2" style="border: 1px solid black;">1<sup>st</sup> part</td>
            <td style="border-bottom: hidden;">&nbsp; <!-- EMPTY --></td>
            <td colspan="2" style="border: 1px solid black;">2<sup>nd</sup> part</td>
        </tr>
    </table>
    Now we got the 1 is in first part, and we will do divide and conquer for first part again. At last, we will get 1. Here we are dividing the array as 2 parts everytime. So the time complexity is,

    ```
    log 2(^n) = ?
    * n = Size of the array.

    log 2(^8) = 3
    ```
    if we have an array with size of 1048576, then the time complexity will be,
    
    ```
    log 2(^1048576) = 20
    ```

Graph of all Big O notations

<img src="resources/Big_O_Operations_graph.png" alt="Big_O_Operations_graph">

<h4>Few tricky examples</h4>

* Example 1

    What will be the time complexity for bellow code?
    ```
    private static void printNumbers(int a, int b)
    {
        for(int i=0; i<a; i++)
            System.out.println(i)
        
        for(int j=0; j<b; j++)
            System.out.println(j)
    }
    ```
    Here, we have two for loops, which will run based on the range of two different integers. One integer value can be 1 and other can be a million also. So the time complexity will be
    ```
    Big O(A+B)
    ```

* Example 2

    What will be the time complexity for bellow code?
    ```
    private static void printNumbers(int a, int b)
    {
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.println(i + " " + j)
            }
        }
    }
    ```
    Here, we have two nested for loops, which will run based on the range of two different integers. One integer value can be 1 and other can be a million also. So the time complexity will be
    ```
    Big O(A*B)
    ```

* If the algorithm is in the form of, `Do this, then when you are all done, do that`, then `add` the runtimes.
* If the algorithm is in the form of, `Do this for each time you do that`, then `multiply` the runtimes.

<h2>Space Complexity</h2>

* Example 1 - Space complexity - O(n)

    ```
    private static int sumNumbers(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        return n + sumNumbers(n-1);
    }
    ```

* Example 1 - Space complexity - O(n)

    ```
    private static int pairSumSequence(int n)
    {
        var total = 0;
        for (int i=0; i<n; i++)
        {
            total = total + pairSum(i, i+1);
        }
        return total;
    }
    private static int pairSum(int a, int b)
    {
        return a + b;
    }
    ```

<h4>5 rules of Big O</h4>

<table style="text-align:center">
    <caption><h3>5 rules of Big O</h3></caption>
    <th>Number</th>
    <th>Description</th>
    <th>Complexity</th>
    <tr>
        <td>1.</td>
        <td>Any assignment statements and if statements that are executed once regardless of the size of the problem</td>
        <td>O(1)</td>
    </tr>
    <tr>
        <td>2.</td>
        <td>A simple for loop from 0-n(with no nested loops)</td>
        <td>O(n)</td>
    </tr>
    <tr>
        <td>3.</td>
        <td>A nested loop with the same type takes quadritic time complexity.</td>
        <td>O(n&#0178;)</td>
    </tr>
    <tr>
        <td>4.</td>
        <td>A loop, in which the controlling parameter is divided by two in each step.</td>
        <td>O(log n)</td>
    </tr>
    <tr>
        <td>5.</td>
        <td>When dealing with multiple statements, just add them up.</td>
        <td></td>
    </tr>
</table>




<h2>Linked list Nodes.</h2>
Linked list consists of Nodes. Nodes are basically of three types.
    <ul>
        <li>Head</li>
        <li>Normal</li>
        <li>Tail</li>
    </ul>

<h3>Node Details</h3>
    <ul>
        <li>NodeValue - Value of the respective Node.</li>
        <li>Location - Each node hold the location of <b>previous Node(All LL other than SinglyLL)</b> or <b>Next Node.</b></li>
    </ul>

<h4>Example of sample Node of <u>Singly Linked List</u></h4>
    <table>
        <th>NodeValue</th>
        <th>Location</th>
        <tr>
            <td>4</td>
            <td>005</td>
        </tr>
    </table>

<h4>Example of sample Node of <u>Doubly Linked List</u></h4>
    <table>
        <th>Location</th>
        <th>NodeValue</th>
        <th>Location</th>
        <tr>
            <td>004</td>
            <td>4</td>
            <td>005</td>
        </tr>
    </table>

<table style="text-align:left">
    <caption><h2><u><b>Array</b> vs <b>Linked List</b></u></h2></caption>
    <th>Array</th>
    <th>Linked List</th>
    <tr>
        <td>Array elements are contiguous.</td>
        <td>Linked List elements are non-contiguous, they are connected by location reference with each other.</td>
    </tr>
    <tr>
        <td>Cells of the Array can not be deleted.</td>
        <td>Nodes of the Linked List can be deleted. We can call the nodes as an independent object.</td>
    </tr>
    <tr>
        <td>Array size is predefined. New element can not be inserted if the array is full.</td>
        <td>Linked List size can be updated as per the requirement.</td>
    </tr>
    <tr>
        <td>Array elements are directly accessible by the location of the element(eg: ARR[0]).</td>
        <td>For accessing the elements of the Linked List, we have to iterate all the elements located before the element.</td>
    </tr>
    <tr>
        <td>Extra memory is not required.</td>
        <td>Each node needs an extra memory for linked nodes.</td>
    </tr>
</table>

<h2>Types of Linked List</h2>
<ul >
    <li>Singly Linked List</li>
    <li>Circular Singly Linked List</li>
    <li>Doubly Linked List</li>
    <li>Circular Doubly Linked List</li>
</ul>

<table style="text-align:center">
    <caption><h3>Singly Linked List</h3></caption>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <tr>
        <td>Head</td>
        <td>001</td>
        <td>→</td>
        <td>1</td>
        <td>002</td>
        <td>→</td>
        <td>2</td>
        <td>003</td>
        <td>→</td>
        <td>3</td>
        <td>004</td>
        <td>→</td>
        <td>4</td>
        <td>005</td>
        <td>→</td>
        <td>Tail</td>
        <td>null</td>
    </tr>
    <tr>
        <td colspan="2">Head Node</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 001</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 002</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 003</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 004</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 005</td>
    </tr>
</table>

- Last node reference is always null in case of singly linked list.

<table style="text-align:center">
    <caption><h3>Circular Singly Linked List</h3></caption>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <th>→</th>
    <th>NodeValue</th>
    <th>Location</th>
    <tr>
        <td>Head</td>
        <td>001</td>
        <td>→</td>
        <td>1</td>
        <td>002</td>
        <td>→</td>
        <td>2</td>
        <td>003</td>
        <td>→</td>
        <td>3</td>
        <td>004</td>
        <td>→</td>
        <td>4</td>
        <td>005</td>
        <td>→</td>
        <td>Tail</td>
        <td>001</td>
    </tr>
    <tr>
        <td colspan="2">Head Node</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 001</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 002</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 003</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 004</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="2">Node Location - 005</td>
    </tr>
</table>

- For Circular Singly Linked List, last node reference always points to the first node.

Example : 4 player chess game. After fourth player game should come to the first player again.

<table style="text-align:center">
    <caption><h3>Doubly Linked List</h3></caption>
    <th>NodeValue</th>
    <th>Location</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <tr>
        <td>Head</td>
        <td>001</td>
        <td>→</td>
        <td>null</td>
        <td>1</td>
        <td>002</td>
        <td>→</td>
        <td>002</td>
        <td>2</td>
        <td>003</td>
        <td>→</td>
        <td>003</td>
        <td>3</td>
        <td>004</td>
        <td>→</td>
        <td>004</td>
        <td>4</td>
        <td>005</td>
        <td>→</td>
        <td>005</td>
        <td>Tail</td>
        <td>null</td>
    </tr>
    <tr>
        <td colspan="2">Head Node</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 001</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 002</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 003</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 004</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 005</td>
    </tr>
</table>

- Last Node reference is always null in case of Doubly Linked List.

Example : Music Application where we want to move to next song and previous song.

        When the first song is playing that time the previous reference of location of first Node is null. So there is no previous node and the previous button will be deactivated.
        When then last song is playing that time the next reference of location of the last node is null. So there is no next node and the next button will be deactivated.

<table style="text-align:center;">
    <caption><h3>Circular Doubly Linked List</h3></caption>
    <th>NodeValue</th>
    <th>Location</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <th>←</th>
    <th>Location(P)</th>
    <th>NodeValue</th>
    <th>Location(N)</th>
    <tr>
        <td>Head</td>
        <td>001</td>
        <td>→</td>
        <td>005</td>
        <td>1</td>
        <td>002</td>
        <td>→</td>
        <td>002</td>
        <td>2</td>
        <td>003</td>
        <td>→</td>
        <td>003</td>
        <td>3</td>
        <td>004</td>
        <td>→</td>
        <td>004</td>
        <td>4</td>
        <td>005</td>
        <td>→</td>
        <td>005</td>
        <td>Tail</td>
        <td>001</td>
    </tr>
    <tr>
        <td colspan="2">Head Node</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 001</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 002</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 003</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 004</td>
        <td >&nbsp; <!-- EMPTY --></td>
        <td colspan="3">Node Location - 005</td>
    </tr>
</table>

Example : Recent pages of windows(<b>Alt+Shift+Tab</b> or <b>Alt+Tab</b>).

<h3>Creation of Singly Linked List</h3>

        * Create Head and Tail, initialize with null.
        * Create a blank node and assign a value to it and reference it to null.
        * Link Head and Tail with the node.

<h3>Insertion of Singly Linked List</h3>

        * Accept NodeValue and Location as parameter.
        * Create a new Node and assign value into it.
        * Check if Head exists or not.
        * If Head does not exist, [Head = Tail = Node] and terminate.
        * If Head exists, check location Parameter.

<ul >
<li>Insertion at beginning of Singly Linked List</li>

    * If Location = First, [Node.next = Head, Head = Node]

<li>Insertion at the middle of Singly Linked List</li>

    * If Location = Last, [Node.next = null, CurrLast.next = Node, Tail = Node]

<li>Insertion at the end of Singly Linked List</li>

    * If Location = Other, [Find Location(Loopo), Curr.next = Node, Node.next = nextNode]

</ul>
