class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key


class BinarySearchTree:

    def __init__(self, root):
        self.root = root

    def inorder_successor(self, root, target):
        candidate = None
        while root:
            if target == root.val:
                if root.right:
                    candidate = root.right
                    while candidate.left:
                        candidate = root.left
                root = None
            elif target < root.val:
                candidate = root
                root = root.left
            else:
                root = root.right

        if candidate:
            print(str(candidate.val) + ' ', end='')
        else:
            print(str(None) + ' ', end='')


'''
inorder successor

       10 
      /  \
    8     13
  /  \   /  
 4    9 12    

'''

'''

root = Node(1)
root.left = Node(2)
root.right = Node(3)

root.left.left= Node(4)

bTree = Tree(root)
bTree.inorder(root)
print()
bTree.preOrder(root)
print()
bTree.postOrder(root)
print()
print(bTree.height(root))
'''

root = Node(10)
root.left = Node(8)
root.right = Node(13)

root.left.left = Node(4)
root.left.right = Node(9)
root.right.left = Node(12)

bTree = BinarySearchTree(root)
bTree.inorder_successor(root, 8)
bTree.inorder_successor(root, 9)
bTree.inorder_successor(root, 13)
bTree.inorder_successor(root, 4)
bTree.inorder_successor(root, 12)
