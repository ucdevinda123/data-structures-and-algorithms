class SelectionSort:

    def __init__(self):
        pass

    def selection_sort(self,data: list):
        length = len(data)
        for x in range(0, length):
            min_index = x
            for j in range(min_index, length):
                if(data[j] < data[min_index]):
                    min_index = j
            temp = data[x]
            data[x] = data[min_index]
            data[min_index] = temp