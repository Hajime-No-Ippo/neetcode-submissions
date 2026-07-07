class MyHashSet:

    def __init__(self):
        self.map = set()

    def add(self, key: int) -> None:
        if key not in self.map:
            self.map.add(key)

    def remove(self, key: int) -> None:
        if key in self.map:
            self.map.remove(key)
        
    def contains(self, key: int) -> bool:
        for n in self.map:
            if n == key:
                return True
        return False

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)