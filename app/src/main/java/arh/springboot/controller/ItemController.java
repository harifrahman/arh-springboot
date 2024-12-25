package arh.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @GetMapping("/{id}")
    public String getItemById(@PathVariable String id) {
        return "Item with id " + id;
    }

    @PostMapping
    public String createItem(@RequestBody String item) {
        return "Item created: " + item;
    }

    @PutMapping("/{id}")
    public String updateItem(@PathVariable String id, @RequestBody String item) {
        return "Updated item with ID: " + id + " to: " + item;
    }

    @PatchMapping("/{id}")
    public String patchItem(@PathVariable String id, @RequestBody String item) {
        return "Patched item with ID: " + id + " to: " + item;
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable String id) {
        return "Deleted item with ID: " + id;
    }
}
