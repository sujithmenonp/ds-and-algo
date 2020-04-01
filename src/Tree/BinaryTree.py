class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

'''
        1 (1, 4, 3) 
     /   \
    2     3 (3, 4, 3)
      \
        4 ( 4, 4, 1)
    '''

class BinaryTree:

    def __init__(self, root):
        self.root = root

    # 2 4 1 3
    # 3 1 4 2
    def inorder(self, root):
        if root:
            self.inorder(root.left)
            print(str(root.val) + ' ', end='')
            self.inorder(root.right)

    #
    def postOrder(self, root):
        if root:
            self.postOrder(root.left)
            self.postOrder(root.right)
            print(str(root.val) + ' ', end='')

    # 1 2 3
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

    # next element in inorder sequence
    # O(n)
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

    def non_recursive_inorder(self, root):
        stack = [root]
        while stack.__len__() > 0:
            while root.left:
                root = root.left
                stack.append(root)
            cur = stack.pop()
            print(str(cur.val)+' ', end='')
            if cur.right:
                root = cur.right
                stack.append(cur.right)

    def non_recursive_preorder(self, root):
        stack =[root]
        while stack.__len__() > 0:
            cur = stack.pop()
            print(str(cur.val)+' ', end='')
            if cur.right:
                stack.append(cur.right)
            if cur.left:
                stack.append(cur.left)

    def non_recursive_postorder(self, root):
        stack = [root]
        while stack.__len__() > 0:
            if root.left:
                stack.append(root.left)
        cur = stack.pop()
        if cur.right:
            stack.append(cur.right)
        else:
            print(str(cur.val)+' ', end='')
#post order successor
#pre order successor
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
bTree.non_recursive_preorder(root)

'''
bTree.non_recursive_inorder(root)


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
'''
