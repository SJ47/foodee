const TestList = ({allItems}) => {

const testListItems = allItems.map((item, index) => {
    return <li key={index}>{item.name}</li>
})

return (
    <div>
        <ul>{testListItems}</ul>
    </div>
)

}

export default TestList;