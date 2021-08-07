class BubbleSort:
    def __init__(self):
        pass

    @staticmethod
    def sort(data: list):
        array_length = len(data)
        for i in range(0, array_length):
            for j in range(1, array_length - i):
                if data[j - 1] > data[j]:
                    temp = data[j - 1]
                    data[j - 1] = data[j]
                    data[j] = temp