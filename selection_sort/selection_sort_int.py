def selection_sort(list):
    for i in list:
        low = i

        for j in list[list.index(i) + 1:]:
            if j < low:
                low = j

        list[list.index(low)] = i
        list[list.index(i)] = low

    return list


def main():
    original_list = []
    with open("array.txt", 'r') as f:
        lines = f.readline().split(',')
        for item in lines:
            original_list.append(int(item))


    sorted_list = selection_sort(original_list)

    print("\nOriginal List")
    for item in original_list:
        print(item)
    print("\nSorted List")
    for item in sorted_list:
        print(item)

    

if __name__ == "__main__":
    main()
