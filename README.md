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

<h2><u><b>Array</b> vs <b>Linked List</b></u></h2>
<table style="text-align:center">
    <th>Array</th>
    <th>Linked List</th>
    <tr>
        <td>Cells of the Array can not be deleted.</td>
        <td>Nodes of the Linked List can be deleted. We can call the nodes as an independent object.</td>
    </tr>
    <tr>
        <td>Array size is predefined. New element can not be inserted if the array is full.</td>
        <td>Linked List size can be updated as per the requirement.</td>
    </tr>
    <tr>
        <td>Array elements are easily accessible by the location of the element(eg: ARR[0]).</td>
        <td>For accessing the elements of the Linked List, we have to iterate all the elements located before the element.</td>
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

* Last node reference is always null in case of singly linked list.

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

* For Circular Singly Linked List, last node reference always points to the first node.

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
        <td>001</td>
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