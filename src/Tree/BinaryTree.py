class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key


class BinaryTree:

    def __init__(self, root):
        self.root = root

    def inorder(self, root):
        if root:
            self.inorder(root.left)
            print(str(root.val) + ' ', end='')
            self.inorder(root.right)

    def postOrder(self, root):
        if root:
            self.postOrder(root.left)
            self.postOrder(root.right)
            print(str(root.val) + ' ', end='')

    def preOrder(self, root):
        if root:
            print(str(root.val) + ' ', end='')
            self.preOrder(root.left)
            self.postOrder(root.right)

    def height(self, root):
        if root:
            return 1 + max(self.height(root.left), self.height(root.right))
        else:
            return 0

    def inorder_successor(self, root, target):
        global next
        if root:
            self.inorder_successor(root.right, target)
            if root.val == target:
                print("In order successor: of {0} is {1}".format(target, str(None if next is None else next.val)))
            next = root
            self.inorder_successor(root.left, target)

    def inorder_predecessor(self, root, target):
        global next
        if root:
            self.inorder_predecessor(root.left, target)
            if root.val == target:
                print("In order predeccessor of {0} is {1}".format(target, str(None if next is None else next.val)))
            next = root
            self.inorder_predecessor(root.right, target)


'''
inorder successor

       1 
      /  \
    2     3
  /  \   /  
 4    5 6    

'''



root = Node(1)
root.left = Node(2)
root.right = Node(3)

root.left.left= Node(4)
root.left.right = Node(5)
root.right.left = Node(6)

bTree = BinaryTree(root)
print("Inorder traversal...")
bTree.inorder(root)
print("\nPreorder traversal...")
bTree.preOrder(root)
print("\nPostorder traversal...")
bTree.postOrder(root)
print("\nHeight of tree")
print(bTree.height(root))
print("\nInorder successor of binary tree")
next=None
bTree.inorder_successor(root, 5)
next=None
bTree.inorder_successor(root, 4)
next=None
bTree.inorder_successor(root, 3)
next=None
bTree.inorder_successor(root, 2)
next=None
print()

bTree.inorder_predecessor(root, 5)
next=None
bTree.inorder_predecessor(root, 4)
next=None
bTree.inorder_predecessor(root, 3)
next=None
bTree.inorder_predecessor(root, 2)
next=None
